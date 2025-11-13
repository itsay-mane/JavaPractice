public class InstanceObject {

    @Override
    public String toString() {
        return "InstanceObject";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof InstanceObject;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    // protected void finalize()
}
