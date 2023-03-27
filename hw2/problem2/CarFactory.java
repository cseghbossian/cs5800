// Interfaces for buildable, repairable, and restorable objects
interface Buildable {
    void build();
}

interface Repairable {
    void repair();
}

interface Restorable {
    void restore();
}

// Car factories using factory design pattern
interface CarFactory extends Buildable, Repairable, Restorable {}