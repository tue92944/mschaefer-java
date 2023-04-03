package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VisitFilterServiceTest {
    VisitsFilterService visitsFilterService = new VisitsFilterService();
    Visit samplePatientVisit;
    Visit[] visitList;

    @BeforeEach
    void setUp(){
        samplePatientVisit = TestData.getExamplePatientVisit();
        visitList = TestData.getPatientVisits();
    }
    @Test
    void getVisitsByProviderId() {
        int expectedSize = 2;
        assertEquals(expectedSize, visitsFilterService.getVisitsByProviderId("ZXY21", TestData.getPatientVisits()).length);
    }

    @Test
    void getVisitsByPatientId() {
        int expectedSize = 2;
        assertEquals(expectedSize, visitsFilterService.getVisitsByPatientId("ABC123", TestData.getPatientVisits()).length);
    }
}
