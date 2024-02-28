package com.example.countaryname.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;



//nested json ku thani class create pannanum


    @Generated("jsonschema2pojo")
    public class Result {

        @SerializedName("code")
        @Expose
        private Integer code;
        @SerializedName("result")
        @Expose
        private List<CountaryModel> result;
        @SerializedName("extra")
        @Expose
        private List<Object> extra;

//        public Integer getCode() {
//            return code;
//        }
//
//        public void setCode(Integer code) {
//            this.code = code;
//        }
//
//        public  List<CountaryModel> getResult() {
//            return result;
//        }
//
//        public void setResult(List<CountaryModel> result) {
//            this.result = result;
//        }
//
//        public List<Object> getExtra() {
//            return extra;
//        }
//
//        public void setExtra(List<Object> extra) {
//            this.extra = extra;
//        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public List<CountaryModel> getResult() {
            return result;
        }

        public void setResult(List<CountaryModel> result) {
            this.result = result;
        }

        public List<Object> getExtra() {
            return extra;
        }

        public void setExtra(List<Object> extra) {
            this.extra = extra;
        }
    }




