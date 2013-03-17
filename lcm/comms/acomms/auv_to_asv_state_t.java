/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package acomms;
 
import java.io.*;
import java.nio.*;
import java.util.*;
import lcm.lcm.*;
 
public final class auv_to_asv_state_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public double lat;
    public double lon;
    public double depth;
    public short nextwp;
 
    public auv_to_asv_state_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xd35427638dc230d1L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class>());
    }
 
    public static long _hashRecursive(ArrayList<Class> classes)
    {
        if (classes.contains(acomms.auv_to_asv_state_t.class))
            return 0L;
 
        classes.add(acomms.auv_to_asv_state_t.class);
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
 
        outs.writeDouble(this.lat); 
 
        outs.writeDouble(this.lon); 
 
        outs.writeDouble(this.depth); 
 
        outs.writeShort(this.nextwp); 
 
    }
 
    public auv_to_asv_state_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public auv_to_asv_state_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static acomms.auv_to_asv_state_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        acomms.auv_to_asv_state_t o = new acomms.auv_to_asv_state_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.lat = ins.readDouble();
 
        this.lon = ins.readDouble();
 
        this.depth = ins.readDouble();
 
        this.nextwp = ins.readShort();
 
    }
 
    public acomms.auv_to_asv_state_t copy()
    {
        acomms.auv_to_asv_state_t outobj = new acomms.auv_to_asv_state_t();
        outobj.utime = this.utime;
 
        outobj.lat = this.lat;
 
        outobj.lon = this.lon;
 
        outobj.depth = this.depth;
 
        outobj.nextwp = this.nextwp;
 
        return outobj;
    }
 
}
