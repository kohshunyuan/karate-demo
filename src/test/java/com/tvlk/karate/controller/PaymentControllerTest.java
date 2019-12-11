package com.tvlk.karate.controller;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.tvlk.karate.Constant.HOST_NAME;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.modifyUris;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest;
import static org.springframework.restdocs.restassured3.RestAssuredRestDocumentation.document;
import static org.springframework.restdocs.restassured3.RestAssuredRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.templates.TemplateFormats.asciidoctor;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith( {SpringExtension.class, RestDocumentationExtension.class})     // Junit5
@Slf4j
class PaymentControllerTest {

  private RequestSpecification documentationSpec;
  @LocalServerPort
  private int port;

  @BeforeEach
  void setUp(RestDocumentationContextProvider restDocumentation) {
    this.documentationSpec = new RequestSpecBuilder()
        .addFilter(documentationConfiguration(restDocumentation).snippets().withTemplateFormat(asciidoctor())).build();
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void getPaymentOptions() {
    given(this.documentationSpec)
        .header(new Header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE))
        .accept(MediaType.APPLICATION_JSON_VALUE)
        .filter(document("payment-options",
                         preprocessRequest(modifyUris()
                                               .scheme("http")
                                               .host(HOST_NAME)
                                               .removePort())))
        .when()
        .port(this.port)
        .get("/api/payment/options")
        .then()
        .assertThat().statusCode(is(HttpStatus.OK.value()));
  }

  @Test
  void submitPayment() {
    given(this.documentationSpec)
        .header(new Header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE))
        .accept(MediaType.APPLICATION_JSON_VALUE)
        .filter(document("payment-submission",
                         preprocessRequest(modifyUris()
                                               .scheme("http")
                                               .host(HOST_NAME)
                                               .removePort())))
        .when()
        .port(this.port)
        .body("{\n" +
                  "    \"orderId\": 3,\n" +
                  "    \"paymentOption\": \"CREDIT_CARD\"\n" +
                  "}")
        .post("/api/payment/submit")
        .then()
        .assertThat().statusCode(is(HttpStatus.OK.value()));
  }
}