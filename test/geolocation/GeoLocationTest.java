//package geolocation;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class GeoLocationTest{
//        private  GeoLocation location;
//
//        @BeforeEach
//        public void setUp(){
//            location = new GeoLocation();
//        }
//
//        @Test
//        public void testThatTheRightGeoPoliticalZoneIsReturned_WhenaStateIsInputted(){
//
//                String state = "Lagos";
//                Zone expected = Zone.SOUTH_WEST;
//                Zone actual = location.fetchGeoLocation(state);
//
//                assertEquals(expected, actual);
//        }
//
//        @Test
//        public void testAgainThatTheRightGeoPoliticalZoneIsReturned_WhenaStateIsInputted(){
//
//                String state = "Imo";
//                Zone expected = Zone.SOUTH_EAST;
//                Zone actual = location.fetchGeoLocation(state);
//
//                assertEquals(expected, actual);
//        }
//
//        @Test
//        public void testYetAgainThatTheRightGeoPoliticalZoneIsReturned_WhenaStateIsInputted(){
//
//                String state = "Bayelsa";
//                Zone expected = Zone.SOUTH_SOUTH;
//                Zone actual = location.fetchGeoLocation(state);
//
//                assertEquals(expected, actual);
//        }
//
//        @Test
//        public void testOnceAgainThatTheRightGeoPoliticalZoneIsReturned_WhenaStateIsInputted(){
//
//                String state = "Adamawa";
//                Zone expected = Zone.NORTH_EAST;
//                Zone actual = location.fetchGeoLocation(state);
//
//                assertEquals(expected, actual);
//        }
//
//        @Test
//        public void testOnceMoreThatTheRightGeoPoliticalZoneIsReturned_WhenaStateIsInputted(){
//
//                String state = "Kaduna";
//                Zone expected = Zone.NORTH_WEST;
//                Zone actual = location.fetchGeoLocation(state);
//
//                assertEquals(expected, actual);
//        }
//
//        @Test
//        public void testDiligentlyThatTheRightGeoPoliticalZoneIsReturned_WhenaStateIsInputted(){
//
//                String state = "Benue";
//                Zone expected = Zone.NORTH_CENTRAL;
//                Zone actual = location.fetchGeoLocation(state);
//                assertEquals(expected, actual);
//        }
//
//        @Test
//        public void testJudiciouslyThatTheRightGeoPoliticalZoneIsReturned_WhenaStateIsInputted(){
//
//                String state = "ABIA";
//                Zone expected = Zone.SOUTH_EAST;
//                Zone actual = location.fetchGeoLocation(state);
//                assertEquals(expected, actual);
//        }
//
//        @Test
//        public void testToThrowExceptionWhenEnteredInvalidInput(){
//                assertThrows(IllegalArgumentException.class, () -> location.fetchGeoLocation("toronto"));
//        }
//
//}
