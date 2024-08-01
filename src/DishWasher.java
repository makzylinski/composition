public class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Do the dishes");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
