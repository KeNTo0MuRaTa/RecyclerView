package add.murata.muraken.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseData: List<CourseData> = listOf(

        CourseData(R.drawable.luffy,"ルフィ","ワンピース麦わら海賊団船長"),
        CourseData(R.drawable.zoro,"ゾロ","ワンピース麦わら海賊団副船長"),
        CourseData(R.drawable.sanji,"サンジ","ワンピース麦わら海賊団コック"),
        CourseData(R.drawable.usopp,"ウソップ","ワンピース麦わら海賊団狙撃手"),
        CourseData(R.drawable.nami,"ナミ","ワンピース麦わら海賊団航海士")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseData)
    }
}