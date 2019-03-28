package mvvm.simple.sample.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lmvvm/simple/sample/ui/home/HomeAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lmvvm/simple/sample/ui/home/HomeAdapter$SimpleHolder;", "items", "", "Lmvvm/simple/sample/data/model/ListModel;", "(Ljava/util/List;)V", "add", "", "list", "clear", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SimpleHolder", "app_debug"})
public final class HomeAdapter extends android.support.v7.widget.RecyclerView.Adapter<mvvm.simple.sample.ui.home.HomeAdapter.SimpleHolder> {
    private java.util.List<mvvm.simple.sample.data.model.ListModel> items;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    mvvm.simple.sample.ui.home.HomeAdapter.SimpleHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public mvvm.simple.sample.ui.home.HomeAdapter.SimpleHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.util.List<mvvm.simple.sample.data.model.ListModel> list) {
    }
    
    public final void clear() {
    }
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<mvvm.simple.sample.data.model.ListModel> items) {
        super();
    }
    
    public HomeAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lmvvm/simple/sample/ui/home/HomeAdapter$SimpleHolder;", "Lmvvm/simple/sample/ui/util/DataBindingViewHolder;", "Lmvvm/simple/sample/data/model/ListModel;", "dataBinding", "Landroid/databinding/ViewDataBinding;", "(Lmvvm/simple/sample/ui/home/HomeAdapter;Landroid/databinding/ViewDataBinding;)V", "onBind", "", "t", "app_debug"})
    public final class SimpleHolder extends mvvm.simple.sample.ui.util.DataBindingViewHolder<mvvm.simple.sample.data.model.ListModel> {
        
        @java.lang.Override()
        public void onBind(@org.jetbrains.annotations.NotNull()
        mvvm.simple.sample.data.model.ListModel t) {
        }
        
        public SimpleHolder(@org.jetbrains.annotations.NotNull()
        android.databinding.ViewDataBinding dataBinding) {
            super(null, 0, null, false);
        }
    }
}