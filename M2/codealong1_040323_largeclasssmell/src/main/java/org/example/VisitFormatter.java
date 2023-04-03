package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VisitFormatter {
    public String formatDateTime(LocalDateTime dt) {
        return dt.format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm"));
    }

    public String formatPatientForListOutput(Visit patientVisit) {
        StringBuilder result = new StringBuilder();

        result.append(formatDateTime(patientVisit.getAppointmentTime())).append(" - ");
        result.append(patientVisit.getPatient().getPatientLastName()).append(", ").append(patientVisit.getPatient().getPatientFirstName()).append(" ");
        result.append("for ").append(patientVisit.getProvider().getProviderTitle()).append(" ").append(patientVisit.getProvider().getProviderLastName()).append(" - ");
        result.append(patientVisit.getVisitCost()). append(": ").append(patientVisit.isCostPaid() ? "PAID" : "DUE");

        return result.toString();
    }

}
