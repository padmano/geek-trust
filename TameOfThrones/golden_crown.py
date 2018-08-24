from collections import Counter

# Land = panda
# water = octopus
# ice = mammoth
# air = owl 
# fire = dragon
# lookup_dict = {
#     "land" : {
#         "a" : 2,
#         "d" : 1,
#         "n" : 1,
#         "p" : 1
#     },
#     "water" : {
#         "c" : 1,
#         "o" : 2,
#         "t" : 1,
#         "p" : 1,
#         "u" : 1,
#         "s" :1
#     },
#     "ice" : {
#         "a" : 1,
#         "m" : 3,
#         "o" : 1,
#         "t" : 1,
#         "h" : 1
#     },
#     "air" :{
#         "o" : 1,
#         "w" : 1,
#         "l" : 1
#     },
#     "fire" : {
#         "d" : 1,
#         "r" : 1,
#         "a" : 1,
#         "g" : 1,
#         "o" : 1,
#         "n" :1
#     }
# }

look_up_dict = {}
look_up_dict["land"] = Counter("panda")
look_up_dict["water"] = Counter("octopus")
look_up_dict["ice"] = Counter("mammoth")
look_up_dict["air"] = Counter("owl")
look_up_dict["fire"] = Counter("dragon")

# class ReceiverMessage(self):
    

# input_reader = input("Send the message ")

def format_input(raw_string):
    message_dict = {}
    receiver,message = map(str,raw_string.split(','))
    message_dict[receiver] = Counter(message.replace(" ","").replace('"',""))
    return message_dict

# format_input(input_string)

def find_the_ruler(messages_list):
    pass
    



