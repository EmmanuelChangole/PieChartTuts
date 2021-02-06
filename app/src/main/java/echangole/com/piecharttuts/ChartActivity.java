package echangole.com.piecharttuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import static com.github.mikephil.charting.utils.ColorTemplate.COLORFUL_COLORS;

public class ChartActivity extends AppCompatActivity {
    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        pieChart=findViewById(R.id.pieChart);
        ArrayList<PieEntry> entries=new ArrayList<>();
        entries.add(new PieEntry(500,"2016"));
        entries.add(new PieEntry(200,"2017"));
        entries.add(new PieEntry(700,"2018"));
        entries.add(new PieEntry(900,"2019"));
        entries.add(new PieEntry(300,"2020"));

        PieDataSet pieDataSet=new PieDataSet(entries,"cost");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextSize(16f);
        PieData pieData=new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(true);
        pieChart.setCenterText("Cost");
        pieChart.animate();





    }
}