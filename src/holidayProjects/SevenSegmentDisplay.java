package holidayProjects;

import java.util.Arrays;

public class SevenSegmentDisplay {

        private boolean[] segments;

        public SevenSegmentDisplay() {

            segments = new boolean[7];
            Arrays.fill(segments, false);
        }

        public void setSegment(int index, boolean value) {
            if (index >= 0 && index < segments.length) {
                segments[index] = value;
            }
        }

        public boolean getSegment(int index) {
            if (index >= 0 && index < segments.length) {
                return segments[index];
            } else {
                return false;
            }
        }

        public void setDigit(int digit) {
            // Set all segments to "off"
            Arrays.fill(segments, false);

            switch (digit) {
                case 0:
                    segments[0] = true;
                    segments[1] = true;
                    segments[2] = true;
                    segments[3] = true;
                    segments[4] = true;
                    segments[5] = true;
                    break;
                case 1:
                    segments[1] = true;
                    segments[2] = true;
                    break;
                case 2:
                    segments[0] = true;
                    segments[1] = true;
                    segments[3] = true;
                    segments[4] = true;
                    segments[6] = true;
                    break;
                case 3:
                    segments[0] = true;
                    segments[1] = true;
                    segments[2] = true;
                    segments[3] = true;
                    segments[6] = true;
                    break;
                case 4:
                    segments[1] = true;
                    segments[2] = true;
                    segments[5] = true;
                    segments[6] = true;
                    break;
                case 5:
                    segments[0] = true;
                    segments[2] = true;
                    segments[3] = true;
                    segments[5] = true;
                    segments[6] = true;
                    break;
                case 6:
                    segments[0] = true;
                    segments[2] = true;
                    segments[3] = true;
                    segments[4] = true;
                    segments[5] = true;
                    segments[6] = true;
                    break;
                case 7:
                    segments[0] = true;
                    segments[1] = true;
                    segments[2] = true;
                    break;
                case 8:
                    segments[0] = true;
                    segments[1] = true;
                    segments[2] = true;
                    segments[3] = true;
                    segments[4] = true;
                    segments[5] = true;
                    segments[6] = true;
                    break;

            }

        }
}
