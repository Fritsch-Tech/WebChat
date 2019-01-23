<template>
    <div id="Chat" height="100%">
        <v-card id="Messages" max-height="600px" style="overflow-y:scroll">
            <v-list two-line subheader>
                <v-subheader inset>
                    {{channels.find(channel =>
                        channel.id === currentChannelId).name}}
                </v-subheader>

                <v-list-tile
                v-for="message in channels.find(channel =>
                    channel.id === currentChannelId).messages"
                avatar
                @click="">
                    <v-list-tile-avatar>
                        <img :src="users.find(user =>
                            user.id === message.userId).avatar">
                    </v-list-tile-avatar>

                    <v-list-tile-content>
                        <v-list-tile-title class="blue--text">
                            {{users.find(user =>
                                user.id === message.userId).name}}
                        </v-list-tile-title>
                        <v-list-tile-sub-title>{{message.cipherMessage}}</v-list-tile-sub-title>
                    </v-list-tile-content>
                </v-list-tile>
            </v-list>
        </v-card>

        <v-btn v-on:click="sendMessage()">Send</v-btn>
        <v-btn v-on:click="scroll()">scroll To bottom</v-btn>
        <v-textarea
            align-end justify-end
            background-color="grey darken-2"
            style="
                position: absolute;
                bottom:0px;
                right:15px;
                left:15px;"
            v-model="input.message"
            placeholder="Write a message...">
        </v-textarea>
    </div>
</template>

<script>
export default {
    data () {
        return {
            input:{
                message:""
            }
        }
    },
    methods: {
        sendMessage(){
            if(this.input.message != ''){
                this.$store.commit('sendMessage',this.input.message);
                this.input.message = '';
                var messages = this.$el.querySelector("#Messages");
                messages.scrollTop = messages.clientHeight;
            }
        },
        scroll(){
            var messages = this.$el.querySelector("#Messages");
            messages.scrollTop = messages.clientHeight;
        }
    },
    computed:{
        currentChannelId(){
            return this.$store.state.currentChannelId;
        },
        channels(){
            return this.$store.state.channels;
        },
        users(){
            return this.$store.state.users;
        },
        userId(){
            return this.$store.state.userId;
        }
    }

}
</script>
