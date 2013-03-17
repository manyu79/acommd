/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package acomms;
 
import java.io.*;
import java.nio.*;
import java.util.*;
import lcm.lcm.*;
 
public final class cmd_ping_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public short ping_source;
    public short ping_destination;
 
    public cmd_ping_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x50f76824a46757e3L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class>());
    }
 
    public static long _hashRecursive(ArrayList<Class> classes)
    {
        if (classes.contains(acomms.cmd_ping_t.class))
            return 0L;
 
        classes.add(acomms.cmd_ping_t.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeLong(this.utime); 
 
        outs.writeShort(this.ping_source); 
 
        outs.writeShort(this.ping_destination); 
 
    }
 
    public cmd_ping_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public cmd_ping_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static acomms.cmd_ping_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        acomms.cmd_ping_t o = new acomms.cmd_ping_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.ping_source = ins.readShort();
 
        this.ping_destination = ins.readShort();
 
    }
 
    public acomms.cmd_ping_t copy()
    {
        acomms.cmd_ping_t outobj = new acomms.cmd_ping_t();
        outobj.utime = this.utime;
 
        outobj.ping_source = this.ping_source;
 
        outobj.ping_destination = this.ping_destination;
 
        return outobj;
    }
 
}
