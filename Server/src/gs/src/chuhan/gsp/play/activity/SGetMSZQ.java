
package chuhan.gsp.play.activity;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS
import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

abstract class __SGetMSZQ__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SGetMSZQ extends __SGetMSZQ__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 789037;

	public int getType() {
		return 789037;
	}

	public final static int END_OK = 1; // 成功
	public final static int END_ERROR = 2; // 失败

	public int result;

	public SGetMSZQ() {
	}

	public SGetMSZQ(int _result_) {
		this.result = _result_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		_os_.marshal(result);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		result = _os_.unmarshal_int();
		if (!_validator_()) {
			throw new VerifyError("validator failed");
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SGetMSZQ) {
			SGetMSZQ _o_ = (SGetMSZQ)_o1_;
			if (result != _o_.result) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += result;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(result).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SGetMSZQ _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = result - _o_.result;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

