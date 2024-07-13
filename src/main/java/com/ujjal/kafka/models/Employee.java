/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.ujjal.kafka.models;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Employee extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -8096882995272790253L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Employee\",\"namespace\":\"com.ujjal.dto\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"dob\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<Employee> ENCODER =
            new BinaryMessageEncoder<Employee>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<Employee> DECODER =
            new BinaryMessageDecoder<Employee>(MODEL$, SCHEMA$);

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     *
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<Employee> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     *
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<Employee> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     *
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<Employee> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<Employee>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Serializes this Employee to a ByteBuffer.
     *
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /**
     * Deserializes a Employee from a ByteBuffer.
     *
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a Employee instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static Employee fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    @Deprecated
    public CharSequence id;
    @Deprecated
    public CharSequence firstName;
    @Deprecated
    public CharSequence lastName;
    @Deprecated
    public CharSequence email;
    @Deprecated
    public CharSequence dob;
    @Deprecated
    public int age;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public Employee() {
    }

    /**
     * All-args constructor.
     *
     * @param id        The new value for id
     * @param firstName The new value for firstName
     * @param lastName  The new value for lastName
     * @param email     The new value for email
     * @param dob       The new value for dob
     * @param age       The new value for age
     */
    public Employee(CharSequence id, CharSequence firstName, CharSequence lastName, CharSequence email, CharSequence dob, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public Object get(int field$) {
        switch (field$) {
            case 0:
                return id;
            case 1:
                return firstName;
            case 2:
                return lastName;
            case 3:
                return email;
            case 4:
                return dob;
            case 5:
                return age;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, Object value$) {
        switch (field$) {
            case 0:
                id = (CharSequence) value$;
                break;
            case 1:
                firstName = (CharSequence) value$;
                break;
            case 2:
                lastName = (CharSequence) value$;
                break;
            case 3:
                email = (CharSequence) value$;
                break;
            case 4:
                dob = (CharSequence) value$;
                break;
            case 5:
                age = (Integer) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'id' field.
     *
     * @return The value of the 'id' field.
     */
    public CharSequence getId() {
        return id;
    }


    /**
     * Sets the value of the 'id' field.
     *
     * @param value the value to set.
     */
    public void setId(CharSequence value) {
        this.id = value;
    }

    /**
     * Gets the value of the 'firstName' field.
     *
     * @return The value of the 'firstName' field.
     */
    public CharSequence getFirstName() {
        return firstName;
    }


    /**
     * Sets the value of the 'firstName' field.
     *
     * @param value the value to set.
     */
    public void setFirstName(CharSequence value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the 'lastName' field.
     *
     * @return The value of the 'lastName' field.
     */
    public CharSequence getLastName() {
        return lastName;
    }


    /**
     * Sets the value of the 'lastName' field.
     *
     * @param value the value to set.
     */
    public void setLastName(CharSequence value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the 'email' field.
     *
     * @return The value of the 'email' field.
     */
    public CharSequence getEmail() {
        return email;
    }


    /**
     * Sets the value of the 'email' field.
     *
     * @param value the value to set.
     */
    public void setEmail(CharSequence value) {
        this.email = value;
    }

    /**
     * Gets the value of the 'dob' field.
     *
     * @return The value of the 'dob' field.
     */
    public CharSequence getDob() {
        return dob;
    }


    /**
     * Sets the value of the 'dob' field.
     *
     * @param value the value to set.
     */
    public void setDob(CharSequence value) {
        this.dob = value;
    }

    /**
     * Gets the value of the 'age' field.
     *
     * @return The value of the 'age' field.
     */
    public int getAge() {
        return age;
    }


    /**
     * Sets the value of the 'age' field.
     *
     * @param value the value to set.
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Creates a new Employee RecordBuilder.
     *
     * @return A new Employee RecordBuilder
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Creates a new Employee RecordBuilder by copying an existing Builder.
     *
     * @param other The existing builder to copy.
     * @return A new Employee RecordBuilder
     */
    public static Builder newBuilder(Builder other) {
        if (other == null) {
            return new Builder();
        } else {
            return new Builder(other);
        }
    }

    /**
     * Creates a new Employee RecordBuilder by copying an existing Employee instance.
     *
     * @param other The existing instance to copy.
     * @return A new Employee RecordBuilder
     */
    public static Builder newBuilder(Employee other) {
        if (other == null) {
            return new Builder();
        } else {
            return new Builder(other);
        }
    }

    /**
     * RecordBuilder for Employee instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Employee>
            implements org.apache.avro.data.RecordBuilder<Employee> {

        private CharSequence id;
        private CharSequence firstName;
        private CharSequence lastName;
        private CharSequence email;
        private CharSequence dob;
        private int age;

        /**
         * Creates a new Builder
         */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         *
         * @param other The existing Builder to copy.
         */
        private Builder(Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.firstName)) {
                this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.lastName)) {
                this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
            if (isValidValue(fields()[3], other.email)) {
                this.email = data().deepCopy(fields()[3].schema(), other.email);
                fieldSetFlags()[3] = other.fieldSetFlags()[3];
            }
            if (isValidValue(fields()[4], other.dob)) {
                this.dob = data().deepCopy(fields()[4].schema(), other.dob);
                fieldSetFlags()[4] = other.fieldSetFlags()[4];
            }
            if (isValidValue(fields()[5], other.age)) {
                this.age = data().deepCopy(fields()[5].schema(), other.age);
                fieldSetFlags()[5] = other.fieldSetFlags()[5];
            }
        }

        /**
         * Creates a Builder by copying an existing Employee instance
         *
         * @param other The existing instance to copy.
         */
        private Builder(Employee other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.firstName)) {
                this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.lastName)) {
                this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.email)) {
                this.email = data().deepCopy(fields()[3].schema(), other.email);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.dob)) {
                this.dob = data().deepCopy(fields()[4].schema(), other.dob);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.age)) {
                this.age = data().deepCopy(fields()[5].schema(), other.age);
                fieldSetFlags()[5] = true;
            }
        }

        /**
         * Gets the value of the 'id' field.
         *
         * @return The value.
         */
        public CharSequence getId() {
            return id;
        }


        /**
         * Sets the value of the 'id' field.
         *
         * @param value The value of 'id'.
         * @return This builder.
         */
        public Builder setId(CharSequence value) {
            validate(fields()[0], value);
            this.id = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'id' field has been set.
         *
         * @return True if the 'id' field has been set, false otherwise.
         */
        public boolean hasId() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'id' field.
         *
         * @return This builder.
         */
        public Builder clearId() {
            id = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'firstName' field.
         *
         * @return The value.
         */
        public CharSequence getFirstName() {
            return firstName;
        }


        /**
         * Sets the value of the 'firstName' field.
         *
         * @param value The value of 'firstName'.
         * @return This builder.
         */
        public Builder setFirstName(CharSequence value) {
            validate(fields()[1], value);
            this.firstName = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'firstName' field has been set.
         *
         * @return True if the 'firstName' field has been set, false otherwise.
         */
        public boolean hasFirstName() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'firstName' field.
         *
         * @return This builder.
         */
        public Builder clearFirstName() {
            firstName = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'lastName' field.
         *
         * @return The value.
         */
        public CharSequence getLastName() {
            return lastName;
        }


        /**
         * Sets the value of the 'lastName' field.
         *
         * @param value The value of 'lastName'.
         * @return This builder.
         */
        public Builder setLastName(CharSequence value) {
            validate(fields()[2], value);
            this.lastName = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'lastName' field has been set.
         *
         * @return True if the 'lastName' field has been set, false otherwise.
         */
        public boolean hasLastName() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'lastName' field.
         *
         * @return This builder.
         */
        public Builder clearLastName() {
            lastName = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'email' field.
         *
         * @return The value.
         */
        public CharSequence getEmail() {
            return email;
        }


        /**
         * Sets the value of the 'email' field.
         *
         * @param value The value of 'email'.
         * @return This builder.
         */
        public Builder setEmail(CharSequence value) {
            validate(fields()[3], value);
            this.email = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'email' field has been set.
         *
         * @return True if the 'email' field has been set, false otherwise.
         */
        public boolean hasEmail() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'email' field.
         *
         * @return This builder.
         */
        public Builder clearEmail() {
            email = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'dob' field.
         *
         * @return The value.
         */
        public CharSequence getDob() {
            return dob;
        }


        /**
         * Sets the value of the 'dob' field.
         *
         * @param value The value of 'dob'.
         * @return This builder.
         */
        public Builder setDob(CharSequence value) {
            validate(fields()[4], value);
            this.dob = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'dob' field has been set.
         *
         * @return True if the 'dob' field has been set, false otherwise.
         */
        public boolean hasDob() {
            return fieldSetFlags()[4];
        }


        /**
         * Clears the value of the 'dob' field.
         *
         * @return This builder.
         */
        public Builder clearDob() {
            dob = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        /**
         * Gets the value of the 'age' field.
         *
         * @return The value.
         */
        public int getAge() {
            return age;
        }


        /**
         * Sets the value of the 'age' field.
         *
         * @param value The value of 'age'.
         * @return This builder.
         */
        public Builder setAge(int value) {
            validate(fields()[5], value);
            this.age = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /**
         * Checks whether the 'age' field has been set.
         *
         * @return True if the 'age' field has been set, false otherwise.
         */
        public boolean hasAge() {
            return fieldSetFlags()[5];
        }


        /**
         * Clears the value of the 'age' field.
         *
         * @return This builder.
         */
        public Builder clearAge() {
            fieldSetFlags()[5] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Employee build() {
            try {
                Employee record = new Employee();
                record.id = fieldSetFlags()[0] ? this.id : (CharSequence) defaultValue(fields()[0]);
                record.firstName = fieldSetFlags()[1] ? this.firstName : (CharSequence) defaultValue(fields()[1]);
                record.lastName = fieldSetFlags()[2] ? this.lastName : (CharSequence) defaultValue(fields()[2]);
                record.email = fieldSetFlags()[3] ? this.email : (CharSequence) defaultValue(fields()[3]);
                record.dob = fieldSetFlags()[4] ? this.dob : (CharSequence) defaultValue(fields()[4]);
                record.age = fieldSetFlags()[5] ? this.age : (Integer) defaultValue(fields()[5]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<Employee>
            WRITER$ = (org.apache.avro.io.DatumWriter<Employee>) MODEL$.createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<Employee>
            READER$ = (org.apache.avro.io.DatumReader<Employee>) MODEL$.createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException {
        out.writeString(this.id);

        out.writeString(this.firstName);

        out.writeString(this.lastName);

        out.writeString(this.email);

        out.writeString(this.dob);

        out.writeInt(this.age);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.id = in.readString(this.id instanceof Utf8 ? (Utf8) this.id : null);

            this.firstName = in.readString(this.firstName instanceof Utf8 ? (Utf8) this.firstName : null);

            this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8) this.lastName : null);

            this.email = in.readString(this.email instanceof Utf8 ? (Utf8) this.email : null);

            this.dob = in.readString(this.dob instanceof Utf8 ? (Utf8) this.dob : null);

            this.age = in.readInt();

        } else {
            for (int i = 0; i < 6; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.id = in.readString(this.id instanceof Utf8 ? (Utf8) this.id : null);
                        break;

                    case 1:
                        this.firstName = in.readString(this.firstName instanceof Utf8 ? (Utf8) this.firstName : null);
                        break;

                    case 2:
                        this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8) this.lastName : null);
                        break;

                    case 3:
                        this.email = in.readString(this.email instanceof Utf8 ? (Utf8) this.email : null);
                        break;

                    case 4:
                        this.dob = in.readString(this.dob instanceof Utf8 ? (Utf8) this.dob : null);
                        break;

                    case 5:
                        this.age = in.readInt();
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }
}










