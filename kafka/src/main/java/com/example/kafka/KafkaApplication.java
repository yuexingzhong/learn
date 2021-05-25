package com.example.kafka;

import com.jd.coo.x.tc.client.resful.dto.ob.task.ObEmptyTrayDto;
import org.assertj.core.util.Lists;

import java.util.*;

public class KafkaApplication {


    public static void initJdCoordinate(String points) {
        Integer initX = 1001;
        Integer initY = 1002;
        Map<Double, Integer> xMap = new HashMap<>();
        List<Double> xs = new ArrayList<>();
        Map<Double, Integer> yMap = new HashMap<>();
        List<Double> ys = new ArrayList<>();
        List<String> pointList = Lists.newArrayList(points.split(";"));
        for (String s : pointList) {
            xs.add(Double.valueOf(s.split(",")[0]));
            ys.add(Double.valueOf(s.split(",")[1]));
        }
        Set<Double> xSet = new HashSet<>(xs);
        xs = new ArrayList<>(xSet);
        Collections.sort(xs, Comparator.comparing(Double::valueOf));

        Integer lastXNum = 0;
        for (int i = 0; i < xs.size(); i++) {
            if (xMap.get(xs.get(i)) == null) {

                xMap.put(xs.get(i), lastXNum);
                lastXNum += 1;
            }
        }
        Set<Double> ySet = new HashSet<>(ys);
        ys = new ArrayList<>(ySet);
        Collections.sort(ys, Comparator.comparing(Double::valueOf));
        Integer lastYNum = 0;
        for (int i = 0; i < ys.size(); i++) {
            if (yMap.get(ys.get(i)) == null) {
                yMap.put(ys.get(i), lastYNum);
                lastYNum += 1;
            }
        }
        String sql = "INSERT INTO `jdx_aw_wcs`.`aw_point_config` ( `coordinate_x`, `coordinate_y`, `jd_coordinate`, `create_time`, `create_user`, `is_delete`, `ts`, `update_time`, `update_user`, `distribute_no`, `map_no`, `org_no`, `warehouse_no`) VALUES ('%s', '%s', '%s','2021-03-19', 'JDX', '0', NULL, '2021-03-19', 'JDX', '8', '888', '8', '8');";
        for (int i = 0; i < pointList.size(); i++) {
            String[] split = pointList.get(i).split(",");
            System.out.println(String.format(sql, split[0], split[1], (initX + xMap.get(Double.valueOf(split[0]))) + "" + (initY + yMap.get(Double.valueOf(split[1])))));
        }

    }


    public static void main(String[] args) {

        String point = "3.7,5.75;4.25,5.75;4.53,5.75;5.04,5.75;5.55,5.75;6.06,5.75;6.66,5.75;7.26,5.75;7.56,5.75;7.56,6.6;7.56,7.45;8.12,5.75;8.96,5.75;3.7,4.83;7.56,4.83;8.96,4.83;8.96,6.6;8.96,7.45;3.7,3.98;4.25,3.98;4.53,3.98;5.04,3.98;5.55,3.98;6.06,3.98;6.66,3.98;7.26,3.98;7.56,3.98;8.12,3.98;8.96,3.98;";
        initJdCoordinate(point);
        Integer initX = 1001;
        Integer initY = 1001;
        Map<String, Integer> xMap = new HashMap<>();
        List<String> xs = new ArrayList<>();
        Map<String, Integer> yMap = new HashMap<>();
        List<String> ys = new ArrayList<>();
        List<String> pointList = Lists.newArrayList(point.split(";"));
        for (String s : pointList) {
            xs.add(s.split(",")[0]);
            ys.add(s.split(",")[1]);
        }
        Set<String> xSet = new HashSet<>(xs);
        xs = new ArrayList<>(xSet);

        Collections.sort(xs, Comparator.comparing(Double::valueOf));
        for (int i = 0; i < xs.size(); i++) {
            xMap.put(xs.get(i), i + 1);
        }
        Set<String> ySet = new HashSet<>(ys);
        ys = new ArrayList<>(ySet);
        Collections.sort(ys, Comparator.comparing(Double::valueOf));
        for (int i = 0; i < ys.size(); i++) {
            yMap.put(ys.get(i), i + 1);
        }
//        StringBuilder stringBuilder = new StringBuilder();
//        String path = "1,1;2,1;";
//        String[] split = path.split(";");
//        for (String s : split) {
//            stringBuilder.append(initX + xMap.get(s.split(",")[0])).append(initY + yMap.get(s.split(",")[1])).append(",");
//        }
//        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 1));
    }

}
