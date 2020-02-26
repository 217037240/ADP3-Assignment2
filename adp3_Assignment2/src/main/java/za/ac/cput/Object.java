package za.ac.cput;

public class Object {

    private String objectName;
    private int objectNumber;

    public Object(String objectName, int objectNumber){
        this.objectName = objectName;
        this.objectNumber = objectNumber;
    }

    public boolean equals(Object object){
        Object o = (Object) object;

        boolean status = false;
        if (this.objectName.equalsIgnoreCase(o.objectName) && this.objectNumber == object.objectNumber){
            status = true;
        }
        return status;
    }
}
