package sample.com.glp.ui.home

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import sample.com.glp.BR.item
import sample.com.glp.ui.util.DataBindingViewHolder
import sample.com.glp.data.model.ListModel

class HomeAdapter(
    private var items: MutableList<ListModel> = arrayListOf()
) : RecyclerView.Adapter<HomeAdapter.SimpleHolder>() {
    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: SimpleHolder, position: Int) {
        holder.onBind(items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleHolder {
        val binding  = UsersItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SimpleHolder(binding)
    }

    inner class SimpleHolder(dataBinding: ViewDataBinding)
        : DataBindingViewHolder<ListModel>(dataBinding)  {
        override fun onBind(t: ListModel): Unit = with(t) {
            dataBinding.setVariable(item,t)
        }
    }

    fun add(list: MutableList<ListModel>) {
        items.addAll(list)
        notifyDataSetChanged()
    }

    fun clear() {
        items.clear()
        notifyDataSetChanged()
    }
}