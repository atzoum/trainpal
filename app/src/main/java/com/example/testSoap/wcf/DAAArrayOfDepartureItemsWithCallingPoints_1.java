package com.example.testSoap.wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.5.0.6
//
// Created by Quasar Development 
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class DAAArrayOfDepartureItemsWithCallingPoints_1 extends Vector< DAADepartureItemWithCallingPoints_1> implements KvmSerializable
{
    private transient Object __source;

    public void loadFromSoap(Object inObj,DAAExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        __source=inObj;
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                DAADepartureItemWithCallingPoints_1 j1= (DAADepartureItemWithCallingPoints_1)__envelope.get(j,DAADepartureItemWithCallingPoints_1.class,false);
                add(j1);
            }
        }
}
    public Object getSourceObject()
    {
        return __source;
    }
    
    @Override
    public Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0):SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "destination";
        info.type = DAADepartureItemWithCallingPoints_1.class;
    	info.namespace= "http://thalesgroup.com/RTTI/2016-02-16/ldb/types";
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }

    
}