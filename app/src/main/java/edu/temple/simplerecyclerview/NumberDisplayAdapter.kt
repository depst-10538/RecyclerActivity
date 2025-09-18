package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val items: Array<Int>) :
    RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    class NumberViewHolder (val view: TextView) : RecyclerView.ViewHolder (view) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumberViewHolder {
        return NumberViewHolder(
            TextView(parent.context)
        )
    }

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ) {
        holder.view.text = items[position].toString()
        holder.view.textSize = items[position].toFloat()
    }

    override fun getItemCount() = items.size


}