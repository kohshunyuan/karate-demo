# Created by dennis.dao at 13/12/19
Feature: Check if demo service is up

  Scenario: Send health check request to demo service
    * url 'http://ip-172-24-63-138.ap-southeast-1.compute.internal:8888'
    Given path 'actuator', 'health'
    When method get
    Then status 200
    And match response.status == 'UP'
    * print response
