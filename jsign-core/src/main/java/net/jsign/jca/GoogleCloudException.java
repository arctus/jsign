/**
 * Copyright 2021 Emmanuel Bourg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.jsign.jca;

import java.util.Map;

class GoogleCloudException extends Exception {

    public GoogleCloudException(Map<String, ?> response) {
        super(getMessage(response));
    }

    private static String getMessage(Map<String, ?> response) {
        Map error = (Map) response.get("error");
        return error.get("code") + " - " + error.get("status") + ": " + error.get("message");
    }
}