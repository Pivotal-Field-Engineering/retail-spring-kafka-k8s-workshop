/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.pivotal.order.model.avro;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum OrderState {
  CREATED, VALIDATED, FAILED, SHIPPED  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"OrderState\",\"namespace\":\"io.pivotal.order.model.avro\",\"symbols\":[\"CREATED\",\"VALIDATED\",\"FAILED\",\"SHIPPED\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
