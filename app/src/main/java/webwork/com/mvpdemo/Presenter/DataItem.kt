package webwork.com.mvpdemo.Presenter
import com.google.gson.annotations.SerializedName

data class DataItem(

	@field:SerializedName("phone_no")
	val phoneNo: Long? = null,

	@field:SerializedName("is_active")
	val isActive: Boolean? = null,

	@field:SerializedName("gender")
	val gender: String? = null,

	@field:SerializedName("created")
	val created: String? = null,

	@field:SerializedName("profile_pic")
	val profilePic: Any? = null,

	@field:SerializedName("last_name")
	val lastName: String? = null,

	@field:SerializedName("access_token")
	val accessToken: String? = null,

	@field:SerializedName("role_id")
	val roleId: Int? = null,

	@field:SerializedName("dob")
	val dob: Any? = null,

	@field:SerializedName("modified")
	val modified: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("first_name")
	val firstName: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("country_id")
	val countryId: Any? = null,

	@field:SerializedName("username")
	val username: String? = null
)