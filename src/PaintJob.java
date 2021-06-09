public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        //width represents the width of a wall
        //height represents height of a wall
        //areaPerBucket represents area covered per 1 bucket
        //ExtraBuckets represents buckets in home
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;//InValid Value
        } else {
            double areaToPaint = width * height;//Calculating area to paint with available data
            double areaWeCanPaint = areaPerBucket * extraBuckets;//Calculating area we can paint with available data
            double areaLeftToPaint = areaToPaint - areaWeCanPaint;//Calculating area left to paint
            if (areaLeftToPaint < 0) {
                return 0;
            } else {
                return ((int) Math.ceil(areaLeftToPaint / areaPerBucket));
            }
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double areaToPaint = width * height;
            return ((int) Math.ceil(areaToPaint / areaPerBucket));
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return ((int) Math.ceil(area / areaPerBucket));
        }
    }


    public static void main(String[] args){
        System.out.println(getBucketCount(20,3,5,1));
        System.out.println(getBucketCount(20,5,2));
    }


}
