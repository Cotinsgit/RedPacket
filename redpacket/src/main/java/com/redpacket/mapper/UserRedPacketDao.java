package com.redpacket.mapper;

import org.springframework.stereotype.Repository;

import com.redpacket.po.UserRedPacket;

@Repository
public interface UserRedPacketDao {

	/**
	 * �����������Ϣ.
	 * @param userRedPacket �����������Ϣ
	 * @return Ӱ���¼��.
	 */
	public int grapRedPacket(UserRedPacket  userRedPacket);
}
