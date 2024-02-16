import socket

# Create a socket object
s = socket.socket()

# Choose some port number you want your server to listen to
port = 12345

# Bind to the port
s.bind(('', port))

# put the socket into listening mode
s.listen(5)

print('Server is listening')

# a forever loop until we interrupt it
while True:
    # Establish connection with client.
    c, addr = s.accept()
    print('Got connection from', addr)

    # Close the connection
    c.close()