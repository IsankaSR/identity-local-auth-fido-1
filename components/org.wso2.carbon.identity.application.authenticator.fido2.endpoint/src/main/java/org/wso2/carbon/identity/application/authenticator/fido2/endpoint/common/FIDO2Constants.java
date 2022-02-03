/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.authenticator.fido2.endpoint.common;

/**
 * Common constants for FIDO2 API.
 */
public class FIDO2Constants {

    public static final String EQUAL_OPERATOR = "=";
    private static final String FIDO2_ERROR_CODE_PREFIX = "FID-";
    public static final String APP_ID = "appId";
    public static final String DISPLAY_NAME_PATH = "/displayName";

    /**
     * Enum for error messages.
     */
    public enum ErrorMessages {

        ERROR_CODE_START_REGISTRATION("50001", "Error starting the FIDO2 device registration flow.",
                "A system error occurred while serializing start registration response for the appId : %s"),
        ERROR_CODE_FINISH_REGISTRATION("50002", "Error finishing FIDO2 device registration process.",
                "A system error occurred while finishing device registration."),
        ERROR_CODE_START_REGISTRATION_INVALID_ORIGIN("50003", "Error starting the FIDO2 device " +
                "registration flow.", "FIDO2 trusted origin: %s sent in the request is invalid."),
        ERROR_CODE_FETCH_CREDENTIALS("50004", "Error while retrieving user credentials.",
                "A system error occurred while retrieving user credentials for the user : %s"),
        ERROR_CODE_DELETE_CREDENTIALS("50005", "Error while deleting user credentials.",
                "A system error occurred while deleting fido credential with credentialId : %s "),
        ERROR_CODE_FINISH_REGISTRATION_INVALID_REQUEST("50006", "Error finishing" +
                " FIDO2 device registration process.",
                "Challenge response request sent for finish device registration is invalid."),
        ERROR_CODE_FINISH_REGISTRATION_USERNAME_AND_CREDENTIAL_ID_EXISTS("50007", "Error finishing" +
                " FIDO2 device registration process.",
                "FIDO2 device registration already exists for the username and credentialId."),
        ERROR_CODE_START_REGISTRATION_EMPTY_APP_ID("50008", "Error starting the FIDO2 device " +
                "registration flow.", "App ID not available in the request."),
        ERROR_CODE_DELETE_REGISTRATION_INVALID_CREDENTIAL("50009", "Error while deleting user " +
                "credentials.", "Invalid credentialId : %s "),
        ERROR_CODE_DELETE_REGISTRATION_CREDENTIAL_UNAVAILABLE("50010", "Error while deleting user " +
                "credentials.", "FIDO2 device registration is not available with credentialId : %s "),
        ERROR_CODE_UPDATE_REGISTRATION_INVALID_CREDENTIAL("50011", "Error while updating display name" +
                " of device.", "Invalid credentialId : %s "),
        ERROR_CODE_UPDATE_REGISTRATION_CREDENTIAL_UNAVAILABLE("50012", "Error while updating display " +
                "name of device.", "FIDO2 device registration is not available with credentialId : %s "),
        ERROR_CODE_UPDATE_DISPLAY_NAME("50013", "Error while updating display name of device.",
                "A system error occurred while updating display name of device with credentialId : %s "),
        ERROR_CODE_INVALID_INPUT("50014", "Invalid input.", "One of the given inputs is invalid."),
        ERROR_CODE_ACCESS_DENIED_FOR_BASIC_AUTH("50015", "Access denied.", "This method is "
                + "blocked for the requests with basic authentication.");

        private final String code;
        private final String message;
        private final String description;

        ErrorMessages(String code, String message, String description) {

            this.code = code;
            this.message = message;
            this.description = description;
        }

        public String getCode() {

            return FIDO2_ERROR_CODE_PREFIX + code;
        }

        public String getMessage() {

            return message;
        }

        public String getDescription() {

            return description;
        }

        @Override
        public String toString() {

            return getCode() + " | " + getMessage() + " | " + getDescription();
        }
    }
}
