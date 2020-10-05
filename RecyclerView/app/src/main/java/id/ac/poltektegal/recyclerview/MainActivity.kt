package id.ac.poltektegal.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter

class MainActivity : AppCompatActivity() {
    val list = ArryList<Users>()
    val listUsers = arrayOf(
        "Alpa",
        "Bravo",
        "Charlie",
        "Delta",
        "Echo",
        "Foxtrot",
        "Golf",
        "Hotel",
        "India",
        "Juliet",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView.setHasfixedSize(true)
        mRecyclerView.layoutManager = LinerLayoutManager(context this)
        for (i in 0 until listUsers.size){
          list.add(User(listUsers.get(i)))
            if (listUsers.size - 1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecycleView.adapter = adapter
            }
        }
    }
}
