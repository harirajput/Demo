package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new sample.com.glp.DataBinderMapperImpl());
  }
}
