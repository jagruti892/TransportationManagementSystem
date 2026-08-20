class User:

    def __init__(self, userId, userName, emailId, contactNumber, password):
        self.__userId = userId
        self.__userName = userName
        self.__emailId = emailId
        self.__contactNumber = contactNumber
        self.__password = password

    def displayUserDetails(self):
        print("\n----------- User Details -----------")
        print("User ID :", self.__userId)
        print("User Name :", self.__userName)
        print("Email ID :", self.__emailId)
        print("Contact Number :", self.__contactNumber)