/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\workspace\\space22\\07-√¿Õ≈2\\src\\com\\example\\alipay2\\Alipay.aidl
 */
package com.example.alipay2;
public interface Alipay extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.alipay2.Alipay
{
private static final java.lang.String DESCRIPTOR = "com.example.alipay2.Alipay";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.alipay2.Alipay interface,
 * generating a proxy if needed.
 */
public static com.example.alipay2.Alipay asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.alipay2.Alipay))) {
return ((com.example.alipay2.Alipay)iin);
}
return new com.example.alipay2.Alipay.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_pay:
{
data.enforceInterface(DESCRIPTOR);
float _arg0;
_arg0 = data.readFloat();
this.pay(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.alipay2.Alipay
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void pay(float money) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(money);
mRemote.transact(Stub.TRANSACTION_pay, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_pay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void pay(float money) throws android.os.RemoteException;
}
