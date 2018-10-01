package pet_clinics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ClinicImpl<T extends Room> implements Clinic<Room>, Iterable<Room> {
    private static final String INVALID_OPERATION = "Invalid Operation!";
    private String name;
    private Room[] rooms;
    private List<Integer> accommindationIndexes;
    private Iterator<Room> releaseIterator;


    public ClinicImpl(String name, int countOfRooms) {
        this.name = name;
        this.setRooms(countOfRooms);
        this.setAccommindationIndexes();
        this.releaseIterator = new RelaseIterator();
    }

    private void setAccommindationIndexes() {
        this.accommindationIndexes = new ArrayList<>();
        int midlleIndex = rooms.length / 2;
        this.accommindationIndexes.add(midlleIndex);
        if (rooms.length == 1) {
            return;
        }
        int leftIndex = midlleIndex - 1;
        int rightIndex = midlleIndex + 1;
        for (int i = 0; i < rooms.length / 2; i++) {
            this.accommindationIndexes.add(leftIndex--);
            this.accommindationIndexes.add(rightIndex++);
        }
    }


    private void setRooms(int rooms) {
        if (rooms % 2 == 0) {
            throw new IllegalArgumentException(INVALID_OPERATION);
        }
        this.rooms = new Room[rooms];
    }

    @Override
    public Iterator<Room> iterator() {
        return new ClinicIteartor();
    }

    @Override
    public boolean hasEmptyRooms() {
        return Arrays.asList(this.rooms).contains(null);
    }

    @Override
    public boolean addPet(Pet pet) {
        for (Integer accommindationIndex : accommindationIndexes) {
            if (this.rooms[accommindationIndex] == null) {
                this.rooms[accommindationIndex] = new RoomImpl(pet);
                if (this.rooms != null) {
                    return true;
                }
            }
        }
        return false;
    }




    @Override
    public boolean releasePet() {
        while (this.releaseIterator.hasNext()) {
            if (this.releaseIterator.next() != null) {
                this.releaseIterator.remove();
                return true;
            }
        }


        return false;
    }

    @Override
    public Room getRoom(int index) {
        return this.rooms[index - 1];
    }

    private final class ClinicIteartor implements Iterator<Room> {
        private int index;

        ClinicIteartor() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < rooms.length;
        }

        @Override
        public Room next() {
            return rooms[index++];
        }
    }

    private final class RelaseIterator implements Iterator<Room> {
        private int index;
        private List<Integer> indexes;


        public RelaseIterator() {
            this.index = 0;
            this.setIndexes();
        }


        @Override
        public boolean hasNext() {
            return this.index < rooms.length;
        }

        @Override
        public void remove() {
            rooms[this.indexes.get(this.index - 1)] = null;
        }

        @Override
        public Room next() {
            return rooms[indexes.get(index++)];
        }


        private void setIndexes() {
            this.indexes = new ArrayList<>();
            int midleIndex = rooms.length / 2;
            if (rooms.length == 1) {
                return;
            }

            for (int i = midleIndex + 1; i < rooms.length; i++) {
                this.indexes.add(i);
            }
            for (int i = 0; i < midleIndex; i++) {
                this.indexes.add(i);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Room room : rooms) {
            sb.append(room == null ? "Room empty" : room).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
