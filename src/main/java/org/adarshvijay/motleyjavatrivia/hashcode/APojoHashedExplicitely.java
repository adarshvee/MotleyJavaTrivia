package org.adarshvijay.motleyjavatrivia.hashcode;

import java.sql.Timestamp;
import java.util.Objects;

public class APojoHashedExplicitely extends APojoBase {

    public APojoHashedExplicitely(Long id, String firstName, String lastName, int addressId, String comments, Timestamp registeredDate, double userRating) {
        super(id, firstName, lastName, addressId, comments, registeredDate, userRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, addressId, comments, registeredDate, userRating);
    }
}
