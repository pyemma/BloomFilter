/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-11-19")
public class Person implements org.apache.thrift.TBase<Person, Person._Fields>, java.io.Serializable, Cloneable, Comparable<Person> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Person");

  private static final org.apache.thrift.protocol.TField FIRST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("firstName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LAST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField AGE_FIELD_DESC = new org.apache.thrift.protocol.TField("age", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PersonStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PersonTupleSchemeFactory());
  }

  public String firstName; // required
  public String lastName; // required
  public int age; // required
  public String email; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIRST_NAME((short)1, "firstName"),
    LAST_NAME((short)2, "lastName"),
    AGE((short)3, "age"),
    EMAIL((short)4, "email");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FIRST_NAME
          return FIRST_NAME;
        case 2: // LAST_NAME
          return LAST_NAME;
        case 3: // AGE
          return AGE;
        case 4: // EMAIL
          return EMAIL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __AGE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIRST_NAME, new org.apache.thrift.meta_data.FieldMetaData("firstName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_NAME, new org.apache.thrift.meta_data.FieldMetaData("lastName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AGE, new org.apache.thrift.meta_data.FieldMetaData("age", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Person.class, metaDataMap);
  }

  public Person() {
  }

  public Person(
    String firstName,
    String lastName,
    int age,
    String email)
  {
    this();
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    setAgeIsSet(true);
    this.email = email;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Person(Person other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFirstName()) {
      this.firstName = other.firstName;
    }
    if (other.isSetLastName()) {
      this.lastName = other.lastName;
    }
    this.age = other.age;
    if (other.isSetEmail()) {
      this.email = other.email;
    }
  }

  public Person deepCopy() {
    return new Person(this);
  }

  @Override
  public void clear() {
    this.firstName = null;
    this.lastName = null;
    setAgeIsSet(false);
    this.age = 0;
    this.email = null;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public Person setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public void unsetFirstName() {
    this.firstName = null;
  }

  /** Returns true if field firstName is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstName() {
    return this.firstName != null;
  }

  public void setFirstNameIsSet(boolean value) {
    if (!value) {
      this.firstName = null;
    }
  }

  public String getLastName() {
    return this.lastName;
  }

  public Person setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public void unsetLastName() {
    this.lastName = null;
  }

  /** Returns true if field lastName is set (has been assigned a value) and false otherwise */
  public boolean isSetLastName() {
    return this.lastName != null;
  }

  public void setLastNameIsSet(boolean value) {
    if (!value) {
      this.lastName = null;
    }
  }

  public int getAge() {
    return this.age;
  }

  public Person setAge(int age) {
    this.age = age;
    setAgeIsSet(true);
    return this;
  }

  public void unsetAge() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AGE_ISSET_ID);
  }

  /** Returns true if field age is set (has been assigned a value) and false otherwise */
  public boolean isSetAge() {
    return EncodingUtils.testBit(__isset_bitfield, __AGE_ISSET_ID);
  }

  public void setAgeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AGE_ISSET_ID, value);
  }

  public String getEmail() {
    return this.email;
  }

  public Person setEmail(String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIRST_NAME:
      if (value == null) {
        unsetFirstName();
      } else {
        setFirstName((String)value);
      }
      break;

    case LAST_NAME:
      if (value == null) {
        unsetLastName();
      } else {
        setLastName((String)value);
      }
      break;

    case AGE:
      if (value == null) {
        unsetAge();
      } else {
        setAge((Integer)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIRST_NAME:
      return getFirstName();

    case LAST_NAME:
      return getLastName();

    case AGE:
      return getAge();

    case EMAIL:
      return getEmail();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIRST_NAME:
      return isSetFirstName();
    case LAST_NAME:
      return isSetLastName();
    case AGE:
      return isSetAge();
    case EMAIL:
      return isSetEmail();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Person)
      return this.equals((Person)that);
    return false;
  }

  public boolean equals(Person that) {
    if (that == null)
      return false;

    boolean this_present_firstName = true && this.isSetFirstName();
    boolean that_present_firstName = true && that.isSetFirstName();
    if (this_present_firstName || that_present_firstName) {
      if (!(this_present_firstName && that_present_firstName))
        return false;
      if (!this.firstName.equals(that.firstName))
        return false;
    }

    boolean this_present_lastName = true && this.isSetLastName();
    boolean that_present_lastName = true && that.isSetLastName();
    if (this_present_lastName || that_present_lastName) {
      if (!(this_present_lastName && that_present_lastName))
        return false;
      if (!this.lastName.equals(that.lastName))
        return false;
    }

    boolean this_present_age = true;
    boolean that_present_age = true;
    if (this_present_age || that_present_age) {
      if (!(this_present_age && that_present_age))
        return false;
      if (this.age != that.age)
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_firstName = true && (isSetFirstName());
    list.add(present_firstName);
    if (present_firstName)
      list.add(firstName);

    boolean present_lastName = true && (isSetLastName());
    list.add(present_lastName);
    if (present_lastName)
      list.add(lastName);

    boolean present_age = true;
    list.add(present_age);
    if (present_age)
      list.add(age);

    boolean present_email = true && (isSetEmail());
    list.add(present_email);
    if (present_email)
      list.add(email);

    return list.hashCode();
  }

  @Override
  public int compareTo(Person other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFirstName()).compareTo(other.isSetFirstName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstName, other.firstName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastName()).compareTo(other.isSetLastName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastName, other.lastName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAge()).compareTo(other.isSetAge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.age, other.age);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Person(");
    boolean first = true;

    sb.append("firstName:");
    if (this.firstName == null) {
      sb.append("null");
    } else {
      sb.append(this.firstName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastName:");
    if (this.lastName == null) {
      sb.append("null");
    } else {
      sb.append(this.lastName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("age:");
    sb.append(this.age);
    first = false;
    if (!first) sb.append(", ");
    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PersonStandardSchemeFactory implements SchemeFactory {
    public PersonStandardScheme getScheme() {
      return new PersonStandardScheme();
    }
  }

  private static class PersonStandardScheme extends StandardScheme<Person> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Person struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIRST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.firstName = iprot.readString();
              struct.setFirstNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LAST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lastName = iprot.readString();
              struct.setLastNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.age = iprot.readI32();
              struct.setAgeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Person struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.firstName != null) {
        oprot.writeFieldBegin(FIRST_NAME_FIELD_DESC);
        oprot.writeString(struct.firstName);
        oprot.writeFieldEnd();
      }
      if (struct.lastName != null) {
        oprot.writeFieldBegin(LAST_NAME_FIELD_DESC);
        oprot.writeString(struct.lastName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(AGE_FIELD_DESC);
      oprot.writeI32(struct.age);
      oprot.writeFieldEnd();
      if (struct.email != null) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeString(struct.email);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PersonTupleSchemeFactory implements SchemeFactory {
    public PersonTupleScheme getScheme() {
      return new PersonTupleScheme();
    }
  }

  private static class PersonTupleScheme extends TupleScheme<Person> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Person struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFirstName()) {
        optionals.set(0);
      }
      if (struct.isSetLastName()) {
        optionals.set(1);
      }
      if (struct.isSetAge()) {
        optionals.set(2);
      }
      if (struct.isSetEmail()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetFirstName()) {
        oprot.writeString(struct.firstName);
      }
      if (struct.isSetLastName()) {
        oprot.writeString(struct.lastName);
      }
      if (struct.isSetAge()) {
        oprot.writeI32(struct.age);
      }
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Person struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.firstName = iprot.readString();
        struct.setFirstNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.lastName = iprot.readString();
        struct.setLastNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.age = iprot.readI32();
        struct.setAgeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
    }
  }

}

