package org.adarshvijay.motleyjavatrivia.hashcode;

import java.sql.Timestamp;
import java.util.Objects;

public abstract class APojoBase {
    protected final Long id;

    protected final String firstName;

    protected final String lastName;

    protected final int addressId;

    protected final String comments;

    protected final Timestamp registeredDate;

    protected final double userRating;

    public APojoBase(Long id, String firstName, String lastName, int addressId, String comments, Timestamp registeredDate, double userRating) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressId = addressId;
        this.comments = comments;
        this.registeredDate = registeredDate;
        this.userRating = userRating;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAddressId() {
        return addressId;
    }

    public String getComments() {
        return comments;
    }

    public Timestamp getRegisteredDate() {
        return registeredDate;
    }

    public double getUserRating() {
        return userRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        APojoBase aPojoBase = (APojoBase) o;
        return addressId == aPojoBase.addressId && Double.compare(userRating, aPojoBase.userRating) == 0 && Objects.equals(id, aPojoBase.id) && Objects.equals(firstName, aPojoBase.firstName) && Objects.equals(lastName, aPojoBase.lastName) && Objects.equals(comments, aPojoBase.comments) && Objects.equals(registeredDate, aPojoBase.registeredDate);
    }
}
