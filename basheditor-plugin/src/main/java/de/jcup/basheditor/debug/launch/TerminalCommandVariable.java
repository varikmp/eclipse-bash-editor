/*
 * Copyright 2019 Albert Tregnaghi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 */
package de.jcup.basheditor.debug.launch;

public enum TerminalCommandVariable {

    BE_CMD_TITLE("BE_CMD_TITLE"),
    BE_CMD_CALL("BE_CMD_CALL"),
    BE_TERMINAL("BE_TERMINAL");
    
    private String id;

    private TerminalCommandVariable(String id) {
        this.id=id;
    }
    
    public String getId() {
        return id;
    }
    
    public String getVariableRepresentation() {
        return "${"+id+"}";
    }
}
