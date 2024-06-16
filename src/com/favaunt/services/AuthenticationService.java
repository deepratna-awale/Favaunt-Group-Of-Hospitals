/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.favaunt.services;

import com.favaunt.data.DerbyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deepratnaawale
 */
public class AuthenticationService {

    private static final Logger logger = Logger.getLogger(AuthenticationService.class.getName());

    private static final String SELECT_VALID_USER_QUERY = "SELECT * FROM users WHERE userName = ? AND userPassword = ? AND userDesignation = ?";
    private static final String UPDATE_LOGIN_TIMESTAMP_QUERY = "UPDATE users SET userLoginTime = ? WHERE userName = ? AND userDesignation = ?";
    private static final String UPDATE_LOGOUT_TIMESTAMP_QUERY = "UPDATE users SET userLogout = ? WHERE userName = ? AND userDesignation = ?";

    public boolean isValidLogin(final String username, final String password, final String designation) throws SQLException {
        final PreparedStatement preparedStatement = DerbyConnection.getPreparedStatement(SELECT_VALID_USER_QUERY);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        preparedStatement.setString(3, designation);

        final ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            try {
                updateLoginTimestamp(username, designation);
            } catch (final SQLException exception) {
                logger.log(Level.INFO, "Could not update login timestamp", exception);
            }
            return true;
        }
        return false;
    }

    public void updateLoginTimestamp(final String username, final String designation) throws SQLException {
        final PreparedStatement preparedStatement = DerbyConnection.getPreparedStatement(UPDATE_LOGIN_TIMESTAMP_QUERY);
        preparedStatement.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, designation);
        preparedStatement.execute();
    }

    public void updateLogoutTimestamp(final String username, final String designation) throws SQLException {
        final PreparedStatement preparedStatement = DerbyConnection.getPreparedStatement(UPDATE_LOGOUT_TIMESTAMP_QUERY);
        preparedStatement.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, designation);
        preparedStatement.execute();
    }

}
