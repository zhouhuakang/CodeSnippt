	/**
	 * 判断当前医生选择回复的时间是否已经过期。
	 * 
	 * @param r_year
	 *            选择回复的年
	 * @param r_month
	 *            选择回复的月
	 * @param r_day
	 *            选择回复的日
	 * @param isMorning
	 *            是否是在上午回复
	 * @return true 过期 false 未过期，合法
	 */
	private boolean isLegalTime(int r_year, int r_month, int r_day, boolean isMorning) {
		Calendar now = Calendar.getInstance();
		Calendar laterReply = Calendar.getInstance();
		laterReply.set(r_year, r_month - 1, r_day);
		if (laterReply.before(now)) {
			return false;
		}
		return true;
	}