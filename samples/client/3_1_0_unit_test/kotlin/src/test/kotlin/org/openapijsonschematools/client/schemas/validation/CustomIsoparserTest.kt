package org.openapijsonschematools.client.schemas.validation

import java.time.LocalDate
import java.time.ZoneId
import java.time.ZonedDateTime

import kotlin.test.Test
import kotlin.test.assertEquals

class CustomIsoparserTest {
    @Test
    fun testParseIsodatetime() {
        val dateTime: ZonedDateTime = CustomIsoparser.parseIsodatetime("2017-07-21T17:32:28Z")
        val zone = ZoneId.of("Z")
        val expectedDateTime = ZonedDateTime.of(2017, 7, 21, 17, 32, 28, 0, zone)
        assertEquals(dateTime, expectedDateTime)
    }

    @Test
    fun testParseIsodate() {
        val date: LocalDate = CustomIsoparser.parseIsodate("2017-07-21")
        val expectedDate = LocalDate.of(2017, 7, 21)
        assertEquals(date, expectedDate)
    }
}