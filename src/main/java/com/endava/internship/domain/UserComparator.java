package com.endava.internship.domain;

public class UserComparator {
    public int compare(User o1, User o2) {
        if (o1.getAge() == o2.getAge())
            return o1.getFirstName().compareTo(o2.getFirstName());
        else if (o1.getAge() < o2.getAge())
            return 1;
        else return -1;
    }
}
