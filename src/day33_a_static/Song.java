package day33_a_static;

public class Song {
    /*
      Built a structure that I can make an object which will have 4 fields / instance variables.
          -name, length, artist, genre

      Make couple options for object creation.
          -instantiating $name
          -instantiating $name, $length
          -instantiating $name, $length, artist
          -instantiating $name, $length, artist, genre

      Make it possible to see the object information.

   */

        String name;
        double length;
        String artist;
        String genre;


        public Song (String name) {
            this.name = name;
        }

        public Song (String name, double length) {
            this (name);
            this.length = length;
        }

        public Song (String name, double length, String artist) {
            this(name, length);
            this.artist = artist;
        }

        public Song(String name, double length, String artist, String genre) {
            this (name, length, artist);
            this.genre = genre;
        }


        @Override
        public String toString() {
            //String lengthResult = length != 0.0 ? length +"": "There is not length for this object";

            return "Song: " +
                    "\n\tname: " + name +
                    "\n\tlength: " + ( length != 0.0 ? length : "There is not length for this object") +
                    "\n\tartist: " + artist +
                    "\n\tgenre: " + genre;
        }
    }

