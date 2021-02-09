/*
 *  Copyright (c) 2020 Vitasystems GmbH and Christian Chevalley (Hannover Medical School).
 *
 *  This file is part of project EHRbase
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and  limitations under the License.
 *
 */

package org.ehrbase.aql.sql.queryimpl.translator.testcase.pg10.pgsql;

import org.ehrbase.aql.sql.queryimpl.translator.testcase.UC15;

//@Ignore("TODO: BUG - fix it")
public class TestUC15 extends UC15 {

    public TestUC15(){
        super();
        this.expectedSqlExpression =
                "select distinct on (\"/ehr_status/other_details\") \"\".\"/ehr_status/other_details\"" +
                " from (select jsonb_extract_path_text(cast(\"ehr\".\"js_ehr_status\"(\"status_join\".\"ehr_id\") as jsonb),'other_details') as \"/ehr_status/other_details\"" +
                        " from \"ehr\".\"entry\"" +
                        " right outer join \"ehr\".\"composition\" as \"composition_join\" on \"composition_join\".\"id\" = \"ehr\".\"entry\".\"composition_id\"" +
                        " right outer join \"ehr\".\"ehr\" as \"ehr_join\" on \"ehr_join\".\"id\" = \"composition_join\".\"ehr_id\"" +
                        " join \"ehr\".\"status\" as \"status_join\" on \"status_join\".\"ehr_id\" = \"ehr_join\".\"id\"" +
                        " where (\"ehr_join\".\"id\"='2a3b673f-d1b1-44c5-9e38-dcadf67ff2fc')) as \"\"";
    }
}
