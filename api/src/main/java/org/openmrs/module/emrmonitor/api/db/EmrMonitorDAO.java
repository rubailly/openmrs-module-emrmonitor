/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.emrmonitor.api.db;

import org.openmrs.module.emrmonitor.EmrMonitorReport;
import org.openmrs.module.emrmonitor.EmrMonitorServer;
import org.openmrs.module.emrmonitor.EmrMonitorServerType;
import org.openmrs.module.emrmonitor.api.EmrMonitorService;

import java.util.List;
import java.util.Map;

/**
 *  Database methods for {@link EmrMonitorService}.
 */
public interface EmrMonitorDAO {

    List<EmrMonitorServer> getAllEmrMonitorServers();

    List<EmrMonitorServer> getEmrMonitorServerByType(EmrMonitorServerType serverType);

    EmrMonitorServer saveEmrMonitorServer(EmrMonitorServer server);

    EmrMonitorServer getEmrMonitorServerByUuid(String serverUuid);

    EmrMonitorReport saveEmrMonitorReport(EmrMonitorReport report);
    
    Map<String, String> getOpenmrsData();

    void deleteEmrMonitorServer(EmrMonitorServer server);

    List<EmrMonitorReport> getEmrMonitorReportByServerAndStatus(EmrMonitorServer server, EmrMonitorReport.SubmissionStatus status);
}