public class PersonName {
    public static void main(String[] args) {
        Person name = new Person("Kim");
        System.out.println("이름:"+name.getName());

        name.setName("Lee");
        System.out.println("변경된 이름:" +name.getName());
        //name.name;// 변경도 자유롭게, 읽는것도 자유럽게 -> 컨트롤이 어려워서 접근 불가
    }
}
