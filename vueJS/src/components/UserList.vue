<template>
    <div id="UserList">
        <v-list subheader>
            <v-subheader>Recent chat</v-subheader>
            <v-list-tile
            v-for="channel in channels"
            :key="channel.name"
            avatar
            @click="changeChanel(channel.id)">
            <v-list-tile-avatar>
                <img :src="users.find(user => user.id ===
                    channel.userIds.find(id => id !== userId)).avatar">
            </v-list-tile-avatar>

            <v-list-tile-content>
                <v-list-tile-title v-html="channel.name"></v-list-tile-title>
            </v-list-tile-content>

            <v-list-tile-action>
                <v-icon :color="channel.unreadMessages ? 'teal' : 'grey'">chat_bubble</v-icon>
            </v-list-tile-action>
        </v-list-tile>
    </v-list>


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
        changeChanel(channelId){
            this.$store.commit('selectChanel',channelId
        );
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
