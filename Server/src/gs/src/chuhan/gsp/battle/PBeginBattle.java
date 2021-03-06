package chuhan.gsp.battle;

import chuhan.gsp.stage.SFightStageBattle;




public class PBeginBattle extends xdb.Procedure{
	private final long roleid;
	public final int battleid; // 关卡ID
	public final int troopid; // 战队ID
	
//	public int herokey;
	
	public PBeginBattle(long roleid, int battleid, int troopid) {
		this.roleid = roleid;
		this.battleid = battleid;
		this.troopid = troopid;
	}
	
	@Override
	protected boolean process() throws Exception {
		
//		xbean.Properties xprop = xtable.Properties.get(roleid);
//		if(xprop == null)
//		{
//			ErrorManager.getInstance().SendError(roleid, ErrorType.ERR_NOT_ONLINE);
//			return false;
//		}
//		if(xprop.getBattlenum() < this.battleid)
//		{
//			xdb.Procedure.psend(roleid, new SErrorType(ErrorType.ERR_LOCK_BATTLEID));
//			return false;
//		}
		
		Battle battleinfo = BattleManager.getInstance().CreateBattleInfo(roleid, battleid, troopid,"");
		if(battleinfo == null)
			return false;
		
		psendWhileCommit(roleid, new SFightStageBattle(battleinfo.getProtocolBattelInfo()));
		
		return true;
	}
	
}
