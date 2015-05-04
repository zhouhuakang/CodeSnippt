	/**
	 * 根据key:createtime 对JSONArray排序
	 * 
	 * @param array
	 *            待排序的JSONArray
	 * @return
	 */
	public static JSONArray sortJsonArray(JSONArray array) {
		List<JSONObject> jsons = new ArrayList<JSONObject>();

		for (int i = 0; i < array.length(); i++) {
			jsons.add(array.optJSONObject(i));
		}
		Collections.sort(jsons, new Comparator<JSONObject>() {
			@Override
			public int compare(JSONObject lhs, JSONObject rhs) {
				String lid = lhs.optString("createtime");
				String rid = rhs.optString("createtime");

				return lid.compareTo(rid);
			}
		});
		return new JSONArray(jsons);
	}