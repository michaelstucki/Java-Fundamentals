package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B3;

public class LaundryController {
    private LaundryOps ops;

    public LaundryController(LaundryOps ops) {
        this.ops = ops;
    }

    public void setOps(LaundryOps ops) {
        this.ops = ops;
    }

    public void doLaundry() {
        ops.processClothes();
    }

}
