public class Bedroom extends Room {
        private Item[] items = new Item[]{new Item[]("Окно", "Окно с ручкой в дальней стене"),
                new Item[]("Тумбочка","Деревянная тумбочка у кровати"),
                new Item[]("Кровать","Незаправленная кровать из Икеи")};

@Override
public void printItems(){
        int i;
        for(i=0;i<items.length;i++){
        System.out.println(items[i]);
        }
        String s1=String.valueOf(items[i]);
        s1.printItems();
        System.out.println("Претметы в комнате "+room.name+": "+items[i]);
        }
        }