package com.company;

import java.util.List;

public interface ISavaeble {
    List<String> write();
    void read(List<String> savedValues);
}
